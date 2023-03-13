import React , { FC, useState , useEffect} from "react";
import { View , Text, Button , Image} from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import { CCPayments } from "./components";
import AsyncStorage from "@react-native-async-storage/async-storage"

const App : FC = () => {
    const navigation = useNavigation();

    const [ficoScore , setFicoScore] = useState(0)

    //VISA DATA
    const [visaStatus, setVisaStatus] = useState("Apply")
    const [visaLimit, setVisaLimit] = useState("")
    const [visaInterest, setVisaInterest] = useState("18%")
    const [visaBalance, setVisaBalance] = useState("0")
    const [visaAvailable, setVisaAvailable] = useState("0")
    //MASTERCARD DATA
    const [mastercardStatus, setMastercardStatus] = useState("Apply")
    const [mastercardLimit, setMastercardLimit] = useState("")
    const [mastercardInterest, setMastercardInterest] = useState("21%")
    const [mastercardBalance, setMastercardBalance] = useState("0")
    const [mastercardAvailable, setMastercardAvailable] = useState("0")
    //AMEX DATA
    const [amexStatus, setAmexStatus] = useState("Apply")
    const [amexLimit, setAmexLimit] = useState("")
    const [amexInterest, setAmexInterest] = useState("25%")
    const [amexBalance, setAmexBalance] = useState("0")
    const [amexAvailable, setAmexAvailable] = useState("0")

    const checkData = async() =>{
        try{
            const value1 = await AsyncStorage.getItem('ficoScore')
            const value2 = await AsyncStorage.getItem('visaStatus')
            const value3 = await AsyncStorage.getItem('mastercardStatus')
            const value4 = await AsyncStorage.getItem('amexStatus')
            const value5 = await AsyncStorage.getItem('visaLimit')
            const value6 = await AsyncStorage.getItem('mastercardLimit')
            const value7 = await AsyncStorage.getItem('amexLimit')
            if( value1 !== null && value2 !== null && value3 !== null && value4 !== null){
                setFicoScore(Number(value1));
                setVisaStatus(value2);
                setMastercardStatus(value3)
                setAmexStatus(value4)
                setVisaLimit(value5);
                setMastercardLimit(value6)
                setAmexLimit(value7)
            }else {
                alert("Value was null")
            }
        }catch (e) {
            console.log(e)
        }
    }

    useEffect(() =>{
        checkData();
    },[]);

    const upgradeCC = (card:string) =>{
        if(card === "visa" && ficoScore >= 600){
             setVisaStatus("Basic")
             setVisaLimit("1000")
        }
        if(card === "visa" && visaStatus=== "Basic" && ficoScore >= 700){ 
            setVisaStatus("Platinum")
            setVisaLimit("5000")
        }
        if(card === "mastercard" && ficoScore >= 600){ setMastercardStatus("Basic")}
        if(card === "mastercard" && mastercardStatus=== "Basic" && ficoScore >= 700){ setMastercardStatus("Platinum")}
        if(card === "amex" && ficoScore >= 600){ setAmexStatus("Basic")}
        if(card === "amex" && amexStatus=== "Basic" &&ficoScore >= 700){ setAmexStatus("Platinum")}
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicCatTitle}>Credit Cards</Text>
                {/*<VisaCard />*/}
                <View style={mainStyle.spacer} />
                {/* This section is for the Visa CC */}
                {visaStatus === "Apply" &&
                    <View>
                        <Button title="Basic Visa Apply" onPress={() => upgradeCC("visa")}/>
                    </View>
                }
                {visaStatus ==="Basic" &&
                    <View style={mainStyle.horizonFlow}>
                        <Image source={require("../images/visaCC.png")} style={{width: 90, height: 60}} />
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Text style={mainStyle.basicText}>Limit: ${visaLimit}</Text>
                                <Text style={mainStyle.basicText}>Interest: {visaInterest}%</Text>
                            </View>
                            <View>
                                <View style={mainStyle.horizonFlow}>
                                    <Text style={mainStyle.basicText}>Balance: ${visaBalance}</Text>
                                    <Text style={mainStyle.basicText}>Available: S{visaAvailable}%</Text>
                                </View>
                            </View>
                        </View>
                    </View>
                }
                {visaStatus !== "Apply" &&
                    <CCPayments />
                }
                {visaStatus === "Basic" &&
                    <View>
                        <Button title="Apply to Upgrade to Platnium" onPress={() => upgradeCC("visa")}/>
                    </View>
                }
                <View style={mainStyle.spacer} />
                {/* This section is for the Mastercard CC */}
                {mastercardStatus === "Apply" &&
                    <View>
                        <Button title="Basic Mastercard Apply" onPress={() => upgradeCC("mastercard")}/>
                    </View>
                }
                {mastercardStatus ==="Basic" &&
                    <View style={mainStyle.horizonFlow}>
                        <Image source={require("../images/mastercardCC.png")} style={{width: 90, height: 60}} />
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Text style={mainStyle.basicText}>Limit: ${mastercardLimit}</Text>
                                <Text style={mainStyle.basicText}>Interest: {mastercardInterest}%</Text>
                            </View>
                            <View>
                                <View style={mainStyle.horizonFlow}>
                                    <Text style={mainStyle.basicText}>Balance: ${mastercardBalance}</Text>
                                    <Text style={mainStyle.basicText}>Available: S  {mastercardAvailable}%</Text>
                                 </View>
                            </View>
                        </View>
                    </View>
                }
                {mastercardStatus === "Basic" &&
                    <CCPayments />
                }
                {mastercardStatus === "Basic" &&
                    <View>
                        <Button title="Apply to Upgrade to Platnium" onPress={() => upgradeCC("mastercard")}/>
                    </View>
                }

                <View style={mainStyle.spacer} />
                {/* This section is for the AMEX CC */}
                {amexStatus === "Apply" &&
                    <View>
                        <Button title="Basic Amex Apply" onPress={() => upgradeCC("amex")}/>
                    </View>
                }
                {amexStatus === "Basic" &&
                    <View style={mainStyle.horizonFlow}>
                        <Image source={require("../images/amex.png")} style={{width: 90, height: 60}} />
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Text style={mainStyle.basicText}>Limit: ${amexLimit}</Text>
                                <Text style={mainStyle.basicText}>Interest: {amexInterest}%</Text>
                            </View>
                            <View>
                                <View style={mainStyle.horizonFlow}>
                                    <Text style={mainStyle.basicText}>Balance: ${amexBalance}</Text>
                                    <Text style={mainStyle.basicText}>Available: S{amexAvailable}%</Text>
                             </View>
                            </View>
                        </View>
                    </View>
                }
                {amexStatus !== "Apply" &&
                    <CCPayments />
                }
                {amexStatus === "Basic" &&
                    <View>
                        <Button title="Apply to Upgrade to Platnium" onPress={() => upgradeCC("amex")}/>
                    </View>
                }
                
                <View style={mainStyle.spacer} />
                <View>
                    <Text style={mainStyle.basicText}>Fico Score: {ficoScore}</Text>
                </View>
                <View style={mainStyle.spacer} />
                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;