#!/usr/bin/env groovy
//vars/SayHello.groovy

def call() {
  def file1 = new File(".resource");
  def lines = file1.readLines();
  lines.each {
    println it;
  }
}
