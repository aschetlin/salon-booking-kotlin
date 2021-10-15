import { Row, Col, Navbar, Button, Container } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

function App() {
  return (
    <>
      <Navbar bg="dark" variant="dark">
        <Container className="mx-0">
          <Navbar.Brand href="#home">
            AR Salon and Day Spa Services
          </Navbar.Brand>
        </Container>
      </Navbar>

      <Container className="text-center">
        <h1>Hello, world</h1>
      </Container>
    </>
  );
}

export default App;
