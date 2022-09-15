import './Dado.css'

function Dado(props) {
    return (
        <div className="dado-recuadro">{props.valor}</div>
    );
}

export default Dado