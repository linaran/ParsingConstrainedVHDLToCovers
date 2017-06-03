#!/usr/bin/env bash

var="package generated;"
sed -i "1s/.*/$var/" ./gen/*
cp gen/* src/generated/