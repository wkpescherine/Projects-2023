import React , { FC } from "react";
import { createStackNavigator } from "@react-navigation/stack";
import { Main , Dashboard } from "../screens";
const { Navigator , Screen } = createStackNavigator();

const appStack : FC = () => {
    return (
        <Navigator>
            <Screen name="main" component={ Main } options={{headerShown: false}} />
            <Screen name="dashboard" component={ Dashboard } options={{headerShown: false}} />
        </Navigator>
    )
}

export default appStack;