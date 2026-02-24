import React from "react";

type Props = {
  count: number;
  increment: () => void;
  decrement: () => void;
};

const Counter: React.FC<Props> = ({ count, increment, decrement }) => {
  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        alignItems: "center",
        gap: "16px",
        marginTop: "40px",
      }}
    >
      <h1>{count}</h1>

      <div style={{ display: "flex", gap: "10px" }}>
        <button onClick={increment}>+</button>
        <button onClick={decrement}>-</button>
      </div>
    </div>
  );
};

export default Counter;
