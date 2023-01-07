import React , { FC } from "react";
import { createStackNavigator } from "@react-navigation/stack";
import { Main , Home , Patient , Medical } from "../screens";

const { Navigator , Screen } = createStackNavigator();

const appStack : FC = () => {
    return (
        <Navigator>
            <Screen name="main" component={ Main } options={{headerShown: false}} />
            <Screen name="home" component={ Home } options={{headerShown: false}} />
            <Screen name="patient" component={ Patient } options={{headerShown: false}} />
            <Screen name="medical" component={ Medical } options={{headerShown: false}} />
        </Navigator>
    )
}

export default appStack;