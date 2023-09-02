import React from 'react';

function Navbar (props){
    return (
        <div style={{backgroundColor:"#777777", padding: 1}}>
            <div style={{display: 'flex', flexDirection: 'row', justifyContent:"center"}}>
                <h5 style={{padding: 5,}} onClick={() => props.sendData("home")}>Home</h5>
                <h5 style={{padding: 5,}} onClick={() => props.sendData("tshirt")}>T-Shirt</h5>
                <h5 style={{padding: 5,}}>Sweatshirt</h5>
                <h5 style={{padding: 5,}}>Sweatpants</h5>
                <h5 style={{padding: 5,}} onClick={() => props.sendData("search")}>Search</h5>
            </div>
        </div>
    );
}

export default  Navbar;