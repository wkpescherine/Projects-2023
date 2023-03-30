import React , { FC , useState } from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
//import { Stocks } from "./components"

const App : FC = () => {
    const navigation = useNavigation()

    //Info related to Apple Stock
    const [appleStockQty, setAppleStockQty] = useState(0)
    //Info related to Google Stock
    const [googleStockQty, setGoogleStockQty] = useState(0)
    //Info related to Tesla Stock
    const [teslaStockQty, setTeslaStockQty] = useState(0)

    //Info related to the Portfolio Worth
    const [invest, setInvested] = useState(0)
    const [worth, setWorth] = useState(0)

    function stockOptions(purchase:string, action:string){
        if(purchase === "Apple"){
            if(action === "Buy"){
                let temp = appleStockQty+1
                setAppleStockQty(temp)
            }else{
                let temp = appleStockQty-1
                setAppleStockQty(temp)
            }
        }
        if(purchase === "Google"){
            if(action === "Buy"){
                let temp = googleStockQty+1
                setGoogleStockQty(temp)
            }else{
                let temp = googleStockQty-1
                setGoogleStockQty(temp)
            }
        }
        if(purchase === "Tesla"){
            if(action === "Buy"){
                let temp = teslaStockQty+1
                setTeslaStockQty(temp)
            }else{
                let temp = teslaStockQty-1
                setTeslaStockQty(temp)
            }
        }
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicCatTitle}>Stock Market Section</Text>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}>Chase: $0</Text>
                    <Text style={mainStyle.basicText}>BoA: $0</Text>
                </View>
                <View style={mainStyle.spacer} />
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Apple</Text>
                    <Text style={mainStyle.basicText}> Open: $34</Text>
                    <Text style={mainStyle.basicText}> Closed: $37</Text>
                    <Text style={mainStyle.basicText}> Chng: +1%</Text>
                    <Button title="BUY" onPress={() => stockOptions("Apple", "Buy")}/>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Google</Text>
                    <Text style={mainStyle.basicText}> Open: $55</Text>
                    <Text style={mainStyle.basicText}> Closed: $62</Text>
                    <Text style={mainStyle.basicText}> Chng: +1.4%</Text>
                    <Button title="BUY" onPress={() => stockOptions("Google", "Buy")}/>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Tesla</Text>
                    <Text style={mainStyle.basicText}> Open: $24</Text>
                    <Text style={mainStyle.basicText}> Closed: $22</Text>
                    <Text style={mainStyle.basicText}> Chng: -1%</Text>
                    <Button title="BUY" onPress={() => stockOptions("Tesla", "Buy")}/>
                </View>
                <View style={mainStyle.spacer} />
                <Text style={mainStyle.basicText}>Stock Portfolio</Text>
                <Text style={mainStyle.basicText}>Invested: $0</Text>
                <Text style={mainStyle.basicText}>Worth: $0</Text>
                <View>
                    {appleStockQty !== 0 &&
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}>Apple : {appleStockQty}</Text>
                            <Button title="SELL" onPress={() => stockOptions("Apple","Sell")}/>
                        </View>
                    } 
                    {googleStockQty !== 0 &&
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}>Tesla : {googleStockQty}</Text>
                            <Button title="SELL" onPress={() => stockOptions("Google","Sell")}/>
                        </View>
                    } 
                    {teslaStockQty !== 0 &&
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}>Tesla : {teslaStockQty}</Text>
                            <Button title="SELL" onPress={() => stockOptions("Tesla","Sell")}/>
                        </View>
                    }   
                </View>
                <View style={mainStyle.spacer} />
                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;