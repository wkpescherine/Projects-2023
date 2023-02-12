import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import AppStack from "./src/navigator/appNavigator"
import { Provider } from 'react-redux';
//import { StyleSheet, Text, View } from 'react-native';
import configStore from './src/store/configStore';

const store = configStore()

export default function App() {
  return (
    <NavigationContainer>
      <AppStack />
    </NavigationContainer>
  );
}