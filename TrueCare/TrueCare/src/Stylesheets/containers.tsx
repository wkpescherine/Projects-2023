import { StyleSheet } from "react-native";

export default StyleSheet.create({
    container:{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "#000000",//This gets me black
    },
    container90:{
        padding: 5,
        width: "90%"
    },
    horizontal:{
        padding: 5,
    },
    horizontalText:{
        padding: 5,
        fontSize: 48,
    },
    inputContainer:{
        backgroundColor: "#ffffff",
        margin: 5,
        width: "50%",
        justifyContent: "center",
    },
    horizonFlow:{
        padding: 5,
        flexDirection: "row",
        justifyContent: "center",
        alignItems: "center",
    },
    spacing:{
        padding: 5,
    }
})