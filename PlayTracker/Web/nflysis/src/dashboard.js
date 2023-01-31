import React, {useState} from 'react';
import './App.css';
import {Link, useNavigate} from 'react-router-dom'

function Dashboard (){
    let navigate = useNavigate();
    
    function RedirectTo(){
        navigate('./main')
    }

    return (
        <div>
            <p>
                <button onClick={RedirectTo}>LogOut</button> 
            </p>
        </div>
    );
}

export default Dashboard;