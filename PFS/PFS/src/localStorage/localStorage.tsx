import { AsyncStorage } from "@react-native-async-storage/async-storage"
import React , { FC, useState } from "react";
import { View , Text, Button, TextInput } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
//import texts from "../Stylesheets/texts"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";

const App = (value) =>{
    if(value){
        AsyncStorage.setItem("username", value);
    }else {
        alert("No value saved");
    }
}

export default App;
