import React from "react";
import { render, screen } from "@testing-library/react";
import App from "./App";

test("renders navbar with company name", () => {
  render(<App />);
  const linkElement = screen.getByText(/AR Salon and Day Spa Services/i);
  expect(linkElement).toBeInTheDocument();
});
