import React from "react"
import { NavigationContainer } from "@react-navigation/native";
import { createNativeStackNavigator } from "@react-navigation/native-stack";
import { StackActions } from "@react-navigation/native";
import { Main } from "../screens";

const Stack = createNativeStackNavigator();

export default function App(){
    return (
        <NavigationContainer>
            <Stack.Navigator>
                <Stack.Screen
                    name="main"
                    component={ Main } 
                />
            </Stack.Navigator>
        </NavigationContainer>
    )
}