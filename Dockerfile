FROM ubuntu:18.04

MAINTAINER h <hassaanirshad88@gmail.com>

RUN apt-get update && apt-get install -y software-properties-common && apt-get update && add-apt-repository -y ppa:openjdk-r/ppa && apt-get update && apt-get install -y openjdk-8-jdk && apt-get install -y git

RUN git clone https://github.com/hassaanirshad/Commons.git && cd Commons && ./make && ./test hello world
