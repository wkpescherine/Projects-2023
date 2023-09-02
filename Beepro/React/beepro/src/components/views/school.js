import React, {useEffect} from 'react';

function School(props){
    return (
        <div>
            <div style={{backgroundColor:"#999999", padding: 5}}>
                <h1>{props.school}</h1>
            </div>
        </div>
    );
}

export default  School;