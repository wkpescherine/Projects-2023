import React , { FC } from "react";
import { createStackNavigator } from "@react-navigation/stack";
import { Main , Dashboard , StockMarket, BankAcct , Setting } from "../screens";
//import { Settings } from "react-native";
const { Navigator , Screen } = createStackNavigator();

const appStack : FC = () => {
    return (
        <Navigator>
            <Screen name="main" component={ Main } options={{headerShown: false}} />
            <Screen name="dashboard" component={ Dashboard } options={{headerShown: false}} />
            <Screen name="stockmarket" component={ StockMarket } options={{headerShown: false}} />
            <Screen name="bankacct" component={ BankAcct } options={{headerShown: false}} />
            <Screen name="settings" component={ Setting } options={{headerShown: false}} />
        </Navigator>
    )
}

export default appStack;