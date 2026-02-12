// export default function App() {
//   const texts = [<p key={1}>hello</p>, <p key={2}>world</p>]
//   return <div>{texts}</div>
// }

// import {text} from 'stream/consumers'

// export default function App() {
//   const texts = ['hello', 'world'].map((text, index) => <p key={index}>{text}</p>)
//   return <div>{texts}</div>
// }

// import P from './P'

// export default function App() {
//   const texts = ['hello', 'world'].map((text, index) => (
//     <P key={index} children={text}></P>
//   ))
//   return <div children={texts}></div>
// }

import P from './P'

export default function App() {
  return <P>Hello world</P>
}
