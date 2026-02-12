import React from "react"
import ReactDOM from "react-dom/client"

let pPhysicalDOM = document.createElement("p") //물리DOM
pPhysicalDOM.innerText = "Hello physical DOM world!"
document.body.appendChild(pPhysicalDOM)

let pVirtualDOM = React.createElement("p", null, "Hello world! virtual") //가상 DOM
let root = ReactDOM.createRoot(document.getElementById("root") as HTMLElement)
root.render(pVirtualDOM)
