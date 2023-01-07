import React , { FC } from "react";
import { createStackNavigator } from "@react-navigation/stack";
import { Main } from "../screens";

const { Navigator , Screen } = createStackNavigator();

const appStack : FC = () => {
    return (
        <Navigator>
            <Screen
                name="main"
                component={ Main } 
            />
        </Navigator>
    )
}

export default appStack;