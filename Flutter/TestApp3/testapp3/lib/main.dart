import 'package:flutter/material.dart';

void main() {
    //Must always have the run app and the material widget as this is how we build
  runApp(MaterialApp(
    home: Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.grey[800],
      ),
      body: Center(
        Text("Text Here"),
      )
    ),
  ));
}