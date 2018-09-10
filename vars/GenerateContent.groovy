#!/usr/bin/env groovy
//vars/SayHello.groovy

def call() {
  def text = "Hello Tito Mathews. Good Morning!";
  def file1 = new File(".resource");
  file1.text = text;
}
