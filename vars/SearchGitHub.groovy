#!/usr/bin/env groovy
//vars/SearchGitHub.groovy

def call(String s) {
  String url = "https://api.github.com/search/code?q=${s}%20in:file&access_token=b44984164255e21780ababda4888acad0f97eb4d";
  def connection = new URL(url).openConnection() as HttpURLConnection;
  // set some headers
  connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
  connection.setRequestProperty( 'Accept', 'application/json' )
  // get the response code - automatically sends the request
  //println connection.responseCode + ": " + connection.inputStream.text

  message = connection.inputStream.text;
}
