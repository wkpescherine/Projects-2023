import React , { FC , useState } from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
//import { Stocks } from "./components"

const App : FC = () => {
    const navigation = useNavigation()
    const appleStockValues = [0,0,0]
    const googleStockValues = [0,0,0]
    const [appleProfileValues, setAppleProfileValues] = useState(appleStockValues)
    const [googleProfileValues, setGoogleProfileValues] = useState(googleStockValues)

    function buyStock(purchase:string){
        if(purchase === "Apple"){
            stockQuantity[0] += 1
            //setStockQuantity([0], temp)
            console.log("bought")
            console.log(stockQuantity[0])
        }
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicCatTitle}>Stock Market Section</Text>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}>Cash: $0</Text>
                    <Text style={mainStyle.basicText}>Bank: $0</Text>
                    <Text style={mainStyle.basicText}>Invested: $0</Text>
                </View>
                <View style={mainStyle.spacer} />
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Apple</Text>
                    <Text style={mainStyle.basicText}> Open: $34</Text>
                    <Text style={mainStyle.basicText}> Closed: $37</Text>
                    <Text style={mainStyle.basicText}> Chng: +1%</Text>
                    <Button title="BUY" onPress={() => buyStock("Apple")}/>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Google</Text>
                    <Text style={mainStyle.basicText}> Open: $55</Text>
                    <Text style={mainStyle.basicText}> Closed: $62</Text>
                    <Text style={mainStyle.basicText}> Chng: +1.4%</Text>
                    <Button title="BUY"/>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Tesla</Text>
                    <Text style={mainStyle.basicText}> Open: $24</Text>
                    <Text style={mainStyle.basicText}> Closed: $22</Text>
                    <Text style={mainStyle.basicText}> Chng: -1%</Text>
                    <Button title="BUY"/>
                </View>
                <View style={mainStyle.spacer} />
                <Text style={mainStyle.basicText}>Stock Portfolio</Text>
                <Text style={mainStyle.basicText}>{stockQuantity[0]}</Text>
                <View>
                    <View style={mainStyle.horizonFlow}>
                        {teststockQuantity === 0 &&
                            <View>
                                <Text style={mainStyle.basicText}>Apple : {stockQuantity[0]}</Text>
                                <Button title="SELL" />
                            </View>
                        }   
                    </View>
                </View>
                <View style={mainStyle.spacer} />
                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;