#!/bin/bash
 
# 用于批量执行 src 目录下所有 uml 图
# plantuml **/uml*.txt
# path=/home/chen/HFDP/src/*

function func() {
  for file in `ls $1`
  do
    if [ -d $1"/"$file ]
    then
      func $1"/"$file
    elif [[ "$file" =~ ^(uml).*(txt)$ ]]
    then
      echo "file: $file"
      # plantuml -svg $file
    fi
  done
}

func /home/chen/HFDP/src
