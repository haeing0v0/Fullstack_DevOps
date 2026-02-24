import Counter from "./component/Counter";
import useCounter from "./hooks/useCounter";

export default function App() {
  const { count, increment, decrement } = useCounter(0);

  return (
    <div>
      <Counter count={count} increment={increment} decrement={decrement} />
    </div>
  );
}
