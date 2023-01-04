import { NavigationContainer } from "@react-navigation/native";
import React from "react";
import createNativeStackNavigator from "react-navigation/native-stack"

const Stack = createNativeStackNavigator();

const MyStack = () =>{
    return(
        <NavigationContainer>
            <Stack.Navigator>
                <Stack.Screen
                    name="Main"
                    component={Main} 
                />
                <Stack.Screen
                    name="Dashboard"
                    component={Dashboard}
                />
            </Stack.Navigator>
        </NavigationContainer>
    )
}