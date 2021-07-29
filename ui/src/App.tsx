import React from "react";
import { Navbar, Container } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

function App() {
  return (
    <>
      <Navbar bg="dark" variant="dark">
        <Container style={{ marginLeft: 0, marginRight: 0 }}>
          <Navbar.Brand href="#home">
            AR Salon and Day Spa Services
          </Navbar.Brand>
        </Container>
      </Navbar>
    </>
  );
}

export default App;
