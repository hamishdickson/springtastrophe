# springtastrophe

<img src="./pics/tangled.jpg" align=right width="350">

[![Build Status](https://travis-ci.org/hamishdickson/springtastrophe.svg?branch=master)](https://travis-ci.org/hamishdickson/springtastrophe)

We've all been there: your new REST project's going really well, you do everything right - someone suggests "Hey, we should use Spring" and then that cool swagger interface you want to use becomes almost impossible to use :(

This is a little project for scanning your springtastrophe and building that swagger content file thingy you'd otherwise have to write by hand

## Project Status

This project should be considered highly experimental and not production ready


## Implementation

This project is very much in the early stages and certainly does not yet do what it says here. Things which aren't complete yet are:

1. The general plan here is to be able to add this as a maven dependency for a spring rest project. The code will then run at the project's compile time

2. This project will do a filter & fold over the java files looking for `@Controller` annotations and building a list 