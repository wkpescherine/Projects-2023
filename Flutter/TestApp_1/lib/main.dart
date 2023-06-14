import 'package:flutter/material.dart';

//This is required for every app as it is the starting point
void main() {
  //Must always have the run app and the material widget as this is how we build
  runApp(MaterialApp(
    //The first widget must be home
    //home: Center(
    //  child: Text("Hello"),
    //),
    home: Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.grey[800],
      ),
      body: const Center(
        child: Text("Text Here"),
      ),
    ),
  ));
}