#!/usr/bin/env groovy
//vars/ExtractRepoNamesFromSearch.groovy

def call() {
  println message;
  def sluper = new JsonSlurper();
  def result = sluper.parseText(message);
  def items = result.items;
  def items2 = items.unique {s1,s2 -> s1.repository.full_name <=> s2.repository.full_name};
  items2.each {
    println it.repository.full_name;
  }
}
