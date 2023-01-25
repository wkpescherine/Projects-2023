import React , { FC, useState } from "react";
import { View , Text , Button , TextInput, StyleSheet} from "react-native";
import { useNavigation } from "@react-navigation/native";
import styles from "../Stylesheets/containers"

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
        <View style={styles.container}>
            <View style={styles.horizonFlow}>
                <Text>Username:</Text>
                <TextInput placeholder="Enter username" />
            </View>
            <View style={styles.horizonFlow}>
                <Text>Email:</Text>
                <TextInput placeholder="Enter Email"/>
            </View>
            <View style={styles.horizonFlow}>
                <Text style={styles.spacing}>Age:</Text>
                <Text style={styles.spacing}>{age}</Text>
                <Button title="+" onPress={()=>handleAge("+")}/>
                <Text style={styles.spacing} />
                <Button title="-" onPress={()=>handleAge("-")}/>
            </View>
            <Text>Password</Text>
            <TextInput
                placeholder="Enter password" 
            />
            <Button onPress={()=>handleClient()} title={client} />
            <View>
                <Text>Rate : </Text>
                <Button title={rate} onPress={()=>handleRate()} />
            </View>
            <View>
                <Text>Cost: ${cost}</Text>
            </View>
            <Button title="Create Account" onPress={()=>navigation.navigate("home")}/>
            <Button title="Back" onPress={()=>navigation.navigate("main")}/>
        </View>
    )
}

export default App;