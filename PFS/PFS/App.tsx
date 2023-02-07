import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import AppStack from "./src/navigator/appNavigator"
import { StyleSheet, Text, View } from 'react-native';

export default function App() {
  return (
    <NavigationContainer>
      <AppStack />
    </NavigationContainer>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
