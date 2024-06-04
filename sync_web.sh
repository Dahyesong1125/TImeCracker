#!/bin/bash
cp -r /mnt/c/Users/송다혜/Desktop/WEB/* /home/dhdh/WEB
cd /home/dhdh
git add .
git commit -m "Update HTML files and add new files"
git push origin main
