pipeline {
    agent any

    stages {
        stage('Clonar Código') {
            steps {
                // Clona el código desde el repositorio de GitHub
                git url: 'https://github.com/usuario/nombre-del-repositorio.git', branch: 'main'
            }
        }
        
        stage('Compilar con Maven') {
            steps {
                // Usa Maven para compilar el proyecto
                sh 'mvn clean compile'
            }
        }
        
        stage('Pruebas') {
            steps {
                // Ejecuta pruebas unitarias
                sh 'mvn test'
            }
        }
        
        stage('Empaquetar') {
            steps {
                // Crea un paquete (JAR o WAR)
                sh 'mvn package'
            }
        }
        
        stage('Desplegar en Artifactory') {
            steps {
                // Publica el artefacto en Artifactory JFrog
                sh 'mvn deploy'
            }
        }
    }

    post {
        success {
            echo 'Build completado exitosamente.'
        }
        failure {
            echo 'Hubo un error en el build.'
        }
    }
}
