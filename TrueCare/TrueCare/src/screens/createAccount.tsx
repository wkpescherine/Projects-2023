import React , { FC, useState } from "react";
import { View , Text , Button , TextInput} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();
    const [client,setClient] = useState("Patient");
    const [rate,setRate] = useState("Monthly");
    const [cost, setCost] = useState(0);

    function handleClient(){
        if(client==="Patient"){
            setClient("Medical")
        }else{
            setClient("Patient")
        }
    }

    function handleRate(){
        if(rate === "Monthly"){
            setRate("Quarterly")
        }else if (rate === "Quarterly"){
            setRate("Semi-Annually")
        }else if (rate === "Semi-Annually"){
            setRate("Yearly")
        }else{
            setRate("Monthly")
        }
    }

    return(
        <View style={styles.container}>
            <Text>Username</Text>
            <TextInput
                placeholder="Enter username" 
            />
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

const styles = StyleSheet.create({
    container:{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
    }
})

export default App;