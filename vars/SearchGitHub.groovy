#!/usr/bin/env groovy
//vars/SearchGitHub.groovy

def call(String s) {
  String url = "https://api.github.com/search/code?q=${s} in:file&access_token=2580e2cd4bc9f7c13b598315ea561b2b8b8b0b61";
  def connection = new URL(url).openConnection() as HttpURLConnection;
  // set some headers
  connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
  connection.setRequestProperty( 'Accept', 'application/json' )
  // get the response code - automatically sends the request
  println connection.responseCode + ": " + connection.inputStream.text
}
