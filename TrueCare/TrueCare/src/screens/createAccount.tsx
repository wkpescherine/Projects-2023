import React , { FC, useState } from "react";
import { View , Text , Button , TextInput, StyleSheet} from "react-native";
import { useNavigation } from "@react-navigation/native";
//import styles from "../Stylesheets/containers"
import containers from "../Stylesheets/containers";
import texts from "../Stylesheets/texts"
import States from "../components/states"

const App : FC = () => {
    const navigation = useNavigation();
    const [client,setClient] = useState("Patient");
    const [rate,setRate] = useState("Slow");
    const [cost, setCost] = useState(0);
    const [age, setAge] = useState(0);

    function handleClient(){
        if(client==="Patient"){
            setClient("Medical")
        }else{
            setClient("Patient")
        }
    }

    function handleRate(){
        if(rate === "Slow"){
            setRate("Normal")
        }else if (rate === "Normal"){
            setRate("Increased")
        }else if (rate === "Increased"){
            setRate("Rapid")
        }else{
            setRate("Slow")
        }
    }

    function handleAge(sign){
        if(sign === "+"){
            let tempValue = age+1;
            setAge(tempValue)
        }else if( sign ==="-" && age>0){
            let TempValueSub = age-1;
            setAge(TempValueSub)
        }
    }

    return(
        <View style={containers.container}>
            <View style={containers.container90}>
                <Button onPress={()=>handleClient()} title={client} />    
            </View>
            <View style={containers.horizonFlow}>
                <View style={containers.container30}>
                    <Text style={texts.basicText}>Username:</Text>
                </View>
                <TextInput style={containers.inputContainer} placeholder="Enter username" />
            </View>
            <View style={containers.horizonFlow}>
                <View style={containers.container30}>
                    <Text style={texts.basicText}>Email:</Text>
                </View>
                <TextInput style={containers.inputContainer} placeholder="Enter Email"/>
            </View>
            <View style={containers.horizonFlow}>
                <View style={containers.container30}>
                    <Text style={texts.basicText}>Password:</Text>
                </View>
                <TextInput style={containers.inputContainer} placeholder="Enter password" />
            </View>
            <States />
            <View style={containers.horizonFlow}>
                <Text style={texts.basicText}>Age:</Text>
                <Text style={texts.basicText}>{age}</Text>
                <Button title="+" onPress={()=>handleAge("+")}/>
                <Text style={containers.spacing} />
                <Button title="-" onPress={()=>handleAge("-")}/>
                <Text style={texts.basicText}>Rate : </Text>
                <Button title={rate} onPress={()=>handleRate()} />
            </View>
            <View>
                <Text style={texts.basicText}>Cost: ${cost}</Text>
            </View>
            <View style={containers.container90}>
                <Button title="Create Account" onPress={()=>navigation.navigate("home")}/>
            </View>
            <View style={containers.container90}>
                <Button title="Back" onPress={()=>navigation.navigate("main")}/>
            </View>
        </View>
    )
}

export default App;