#!/usr/bin/env python3

import os
import shutil

def convert_prelude_path(path):
    """
    Convert a path like '@prelude//cxx:cxx_utility.bzl' to 'prelude/cxx/cxx_utility.bzl'
    or '@prelude//:artifact_tset.bzl' to 'prelude/artifact_tset.bzl'
    """
    # Remove the '@' prefix
    path = path.lstrip('@')
    
    # Replace '//:' with '/' first (for cases like 'prelude//:artifact_tset.bzl')
    path = path.replace('//:',  '/')
    
    # Replace '//' with '/' (for cases like 'prelude//cxx:cxx_utility.bzl')
    path = path.replace('//', '/')
    
    # Replace remaining ':' with '/'
    path = path.replace(':', '/')
    
    # Ensure the path starts with 'prelude/'
    if not path.startswith('prelude/'):
        path = 'prelude/' + path
        
    return path

def main():
    # Create a set to store unique prelude paths
    prelude_paths = set()
    
    # Read the input file
    with open('files.txt', 'r') as f:
        for line in f:
            # Strip whitespace and check if it's a prelude line
            stripped_line = line.strip()
            if stripped_line.startswith('@prelude'):
                # Convert the path and add to the set
                converted_path = convert_prelude_path(stripped_line)
                prelude_paths.add(converted_path)
    
    # Debug: Print all paths in the set
    print("Paths in the set:")
    for path in sorted(prelude_paths):
        print(f"  {path}")
    
    # Create the prelude_rustonly directory if it doesn't exist
    if not os.path.exists('prelude_rustonly'):
        os.makedirs('prelude_rustonly')
    
    # Copy files from prelude to prelude_rustonly
    for path in prelude_paths:
        try:
            # All paths should now start with 'prelude/'
            # Get the relative path by removing the 'prelude/' prefix
            rel_path = path[len('prelude/'):]
            
            # Source path is in the current working directory
            src_path = path
            
            # Destination path is in the prelude_rustonly directory
            dest_path = os.path.join('prelude_rustonly', rel_path)
            
            # Create destination directory if it doesn't exist
            dest_dir = os.path.dirname(dest_path)
            if not os.path.exists(dest_dir):
                os.makedirs(dest_dir)
            
            # Copy the file if it exists
            if os.path.exists(src_path):
                shutil.copy2(src_path, dest_path)
                print(f"Copied: {src_path} -> {dest_path}")
            else:
                print(f"Warning: Source file not found: {src_path}")
        except Exception as e:
            print(f"Error processing path '{path}': {e}")
    
    # Print all unique converted paths
    print("\nAll unique prelude paths:")
    for path in sorted(prelude_paths):
        print(path)

if __name__ == "__main__":
    main()
