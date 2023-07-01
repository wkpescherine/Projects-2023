import React from 'react';

import Navbar from "../components/navbar"

function School(props){
    return (
        <div>
            <div style={{backgroundColor:"#999999", padding: 5}}>
                <h1>{props.data}</h1>
            </div>
            <Navbar />
        </div>
    );
}

export default  School;