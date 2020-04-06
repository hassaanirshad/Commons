#!/bin/bash

javac -version || echo "Error: Invalid java installation" \
	&& mkdir -p build  || echo "Error: Failed build directory creation" \
	&& javac -cp java/src/ -d build java/src/common/io/IOTest.java || echo "Error: Failed build"

