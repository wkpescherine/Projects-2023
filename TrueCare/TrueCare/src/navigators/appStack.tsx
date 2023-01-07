import React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";
import { Main } from "../screens";

const Stack = createStackNavigator();

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