import ReactDOM from "react-dom/client"
const children = [
  <li key={"google"}>
    <a href="http://www.google.com" target="_blank">
      <p>go to google</p>
    </a>
  </li>,
  <li key={"facebook"}>
    <a href="http://www.facebook.com" target="_blank">
      <p>go to Facebook</p>
    </a>
  </li>,
  <li key={"twitter"}>
    <a href="http://www.twitter.com" target="_blank">
      <p>go to Twitter</p>
    </a>
  </li>
]
const rootVirtualDOM = <ul>{children}</ul>

const root = ReactDOM.createRoot(document.getElementById("root") as HTMLElement)
root.render(rootVirtualDOM)
