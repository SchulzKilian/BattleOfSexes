# Battle of the Sexes Simulation 🧬

<div align="center">
<img src="https://via.placeholder.com/800x400.png?text=Evolution+Simulation+Visualization" alt="Evolution Simulation" />
</div>

## 🌟 Project Overview
An advanced evolutionary simulation based on Richard Dawkins' "The Selfish Gene," specifically modeling the "Battle of the Sexes" concept. The project simulates population dynamics between different mating strategies in a virtual environment.

### Key Features
- 🏙️ City-like environment with autonomous agents
- 👥 Dynamic population simulation
- 🧬 Mendelian inheritance system
- 📊 Real-time data visualization 
- ⚡ High-performance processing options

## 🎯 Core Concepts
The simulation models four distinct types:
- **Faithful Men**: Willing to court and parent
- **Philanderer Men**: Avoid courtship and parenting
- **Coy Women**: Require courtship before mating
- **Fast Women**: Don't require courtship

### Key Parameters
- `a`: Evolutionary benefit of having a baby
- `b`: Cost of parenting
- `c`: Cost of courtship



## 🔧 Technical Implementation
### Architecture
- Multi-threaded design for autonomous agents
- Custom time management system
- Advanced GUI with real-time updates
- Custom graphing libraries
- Mendelian inheritance system

### Core Components
- Thread Architecture: Manages agent interactions
- Time Management: Controls simulation flow
- GUI System: Real-time visualization
- Genetic System: Implements inheritance rules

### Example Code
public class Person {
    private boolean[] genes = new boolean[2];
    public void inherit(Person parent1, Person parent2) {
        // Mendelian inheritance logic
    }
}

## 📈 Results & Applications
### Research Findings
- High courtship costs favor "fast" strategies
- High parenting costs benefit "slow" strategies
- Population equilibrium depends on parameter balance
- Higher reproduction benefits favor fast strategies
- Genetic dominance affects population stability

### Performance Versions
- **Full Visualization**: Complete with GUI and real-time updates
- **Speed-Optimized**: Stripped-down version for rapid simulations

### Real-World Applications
- Maps to r-strategist vs K-strategist species behavior
- Provides insights into evolution of mating strategies
- Models population dynamics in nature
- Demonstrates game theory principles in biology
- Examples: Frogs (r-strategist) vs Dogs (K-strategist)

## 👥 Team Note
> "After four months of regular coding, we reached almost ten thousand lines of code and hundreds of man-hours in debugging this monstrosity of a program. But we couldn't be prouder of the final result."

## 🛠️ Setup and Usage


# Compile the project
javac Main.java

# Run the simulation
java Main

## 📚 References
- Dawkins, R. (1976). The Selfish Gene
- Various papers on evolutionary game theory
- Java Swing documentation

---

*This project was developed as part of a computer science course, combining evolutionary biology concepts with advanced programming principles.*
