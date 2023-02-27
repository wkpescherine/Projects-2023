import React , { FC , useState} from "react";
import { View , Text, Button , Image, TextInput} from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";

const App : FC = () => {
    const navigation = useNavigation();

    const [chaseDeposit, setChaseDeposit] = useState(0)

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicTitle}>Banking</Text>
                <View style={mainStyle.horizonFlow}>
                    <Image source={require("../images/chasebank.png")} style={{width: 120, height: 120}} />
                    <View>
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}> Chase Bank</Text>
                            <Text style={mainStyle.basicText}> ${chaseDeposit}</Text>
                        </View>
                        <View>
                           <TextInput                             
                                style={mainStyle.inputTextStyle}
                            ></TextInput>
                        </View>
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Button title="Withdrawal" />
                                <View style={{padding:5}}></View>
                                <Button title="Deposit" />
                            </View>
                        </View>
                    </View>
                </View>

                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;