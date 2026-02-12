// export default function DispatchEvent() {
//   const onCallDispatchEvent = () => {
//     console.log('onCallDispatchEvent')
//     document.getElementById('root')?.dispatchEvent(new Event('click', {bubbles: true}))
//   }
//   const onCallClick = () => {
//     console.log('onCallClick')
//     document.getElementById('root')?.click()
//   }
//   return (
//     <div>
//       <p>DispatchEvent</p>
//       <button onClick={onCallDispatchEvent}>call dispatchEvent</button>
//       <button onClick={onCallClick}>call click</button>
//     </div>
//   )
// }

export default function DispatchEvent() {
  const onCallDispatchEvent = () => {
    const event = new Event('click', {bubbles: true})
    document.getElementById('root')?.addEventListener('click', e => {
      e.stopPropagation()
      console.log('bubbling stop')
    })

    document.getElementById('root')?.dispatchEvent(event)
  }

  return (
    <div onClick={() => console.log('부모 태그')}>
      <p>DispatchEvent</p>
      <button onClick={onCallDispatchEvent}>call dispatchEvent</button>
    </div>
  )
}
