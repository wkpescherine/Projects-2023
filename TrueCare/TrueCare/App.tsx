import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import React from "react"
import AppStack from "./src/navigators/appStack"

export default function App() {
  return (
      <AppStack />
  );
}