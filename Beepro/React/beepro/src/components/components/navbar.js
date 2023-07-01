import React from 'react';

function Navbar (){
    return (
        <div style={{backgroundColor:"#777777", padding: 1}}>
            <div style={{display: 'flex', flexDirection: 'row', justifyContent:"center"}}>
                <h5 style={{padding: 5,}}>Home</h5>
                <h5 style={{padding: 5,}}>T-Shirt</h5>
                <h5 style={{padding: 5,}}>Sweatshirt</h5>
                <h5 style={{padding: 5,}}>Sweatpants</h5>
                <h5 style={{padding: 5,}}>Search</h5>
            </div>
        </div>
    );
}

export default  Navbar;