import React , { FC, useState } from "react";
import { View , Text, Button, TextInput } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import AsyncStorage from "@react-native-async-storage/async-storage"

const App : FC = () => {
    const navigation = useNavigation();

    //Log in and account related information
    const [newUserName, setNewUserName] = useState("")
    const [newPassword, setNewPassword] = useState("")
    const [confirmUsername, setConfirmUserName] = useState("")
    const [confirmPassworc, setConfirmPassword] = useState("")

    //Game Data will be here actually
    const [timeRate,setTimeRate] = useState("24")
    const [wealth, setWealth] = useState(0)
    const [educationLevel, setEducationLevel] = useState("HS Dropout")
    const [income, setIncome] = useState(0)

    const setRateOfTime = () => {
        if(timeRate === "24"){setTimeRate("12")}
        else if (timeRate === "12"){setTimeRate("6")}
        else if (timeRate === "6"){setTimeRate("4")}
        else if (timeRate === "4"){setTimeRate("2")}
        else if (timeRate === "2"){setTimeRate("24")}
    }

    const setEducation = () => {
        if(educationLevel === "HS Dropout"){setEducationLevel("GED")}
        else if (educationLevel === "GED"){setEducationLevel("HS Grad")}
        else if (educationLevel === "HS Grad"){setEducationLevel("PT College")}
        else if (educationLevel === "PT College"){setEducationLevel("FT College")}
        else if (educationLevel === "FT College"){setEducationLevel("2yr Grad")}
        else if (educationLevel === "2yr Grad"){setEducationLevel("4yr Grad")}
        else if (educationLevel === "4yr Grad"){setEducationLevel("Masters")}
        else if (educationLevel === "Masters"){setEducationLevel("PhD")}
        else if (educationLevel === "PhD"){setEducationLevel("HS Dropout")}
    }

    const setInitIncome = () => {
        if(educationLevel==="HS Dropout"){setIncome(100)}
        else if (educationLevel==="GED" || educationLevel==="HS Grad"){setIncome(500)}
        else if (educationLevel==="PT College" || educationLevel==="FT College"){setIncome(1500)}
        else if (educationLevel==="2yr Grad" || educationLevel==="4yr Grad"){setIncome(3000)}
        else if (educationLevel==="Masters" || educationLevel==="PhD"){setIncome(7500)}
    }

    const saveData = async() =>{
        try{
            console.log("was here")
            await AsyncStorage.setItem('username', newUserName);
            await AsyncStorage.setItem('password', newPassword);
            await AsyncStorage.setItem('wealth', wealth );
            await AsyncStorage.setItem('status', "Active" );
            await AsyncStorage.setItem('timeRate', timeRate );
            navigation.navigate("dashboard")
        }catch (e) {
            alert("Failed")
        }
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicText}>Create New Account</Text>
                <View>
                    <View style={mainStyle.horizonFlow}>
                        <Text style={mainStyle.basicText}>Username:</Text>
                        <TextInput 
                            style={mainStyle.inputTextStyle}
                            placeholder="Enter new username" 
                            onChangeText={text=>setNewUserName(text)}
                            value={newUserName}
                            />
                    </View>
                    <View style={mainStyle.horizonFlow}>
                        <Text style={mainStyle.basicText}>Password:</Text>
                        <TextInput 
                            style={mainStyle.inputTextStyle}
                            placeholder="Enter new password" 
                            onChangeText={text=>setNewPassword(text)}
                            value={newPassword}/>
                    </View>
                    <View style={mainStyle.horizonFlow}>
                        <Text style={mainStyle.basicText}>Username: </Text>
                        <TextInput 
                            style={mainStyle.inputTextStyle}                            
                            placeholder="Confirm new username" 
                            onChangeText={text=>setConfirmUserName(text)}
                            value={confirmUsername}
                            />
                    </View>
                    <View style={mainStyle.horizonFlow}>
                        <Text style={mainStyle.basicText}>Password:</Text>                    
                        <TextInput 
                            style={mainStyle.inputTextStyle}
                            placeholder="Confirm new password" 
                            onChangeText={text=>setConfirmPassword(text)}
                            value={confirmPassworc}/>
                    </View>
                    <View style={mainStyle.horizonFlow}>
                        <Button title="Time Rate : " onPress={() => setRateOfTime()}/>
                        <Text style={mainStyle.basicText}>{timeRate}</Text>
                    </View>
                    <View style={mainStyle.horizonFlow}>
                        <Button title="Education : " onPress={() => setEducation()}/>
                        <Text style={mainStyle.basicText}>{educationLevel}</Text>
                    </View>
                    <View style={mainStyle.horizonFlow}>
                        <Text style={mainStyle.basicText}>Initial Income: {income}</Text>
                    </View>
                </View>
                {newUserName === confirmUsername &&
                newPassword === confirmPassworc &&
                newPassword !== "" &&
                    <Button title="Create Account" onPress={() => saveData()}/>
                }
                <View style={{marginTop: 5}}>
                    <Button title="Back to Main" onPress={() => navigation.navigate("main")}/>
                </View>
            </View>
        </>
    )
}

export default App;