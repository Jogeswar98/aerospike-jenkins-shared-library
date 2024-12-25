@Library('aerospike-jenkins-shared-library') _  // Load the shared library

pipeline {
    agent any  // Use any available Jenkins agent
    stages {
        stage('Clone Repository') {
            steps {
                script {
                    echo "Cloning Aerospike repository..."
                    deploy_aerospike()  // Call the shared library function to deploy Aerospike
                }
            }
        }
        stage('User Approval') {
            steps {
                input message: "Do you want to proceed with the deployment?", ok: "Yes"
            }
        }
        stage('Run Ansible Playbook') {
            steps {
                script {
                    echo "Executing Ansible playbook for Aerospike..."
                    // Add additional deployment logic if necessary
                }
            }
        }
        stage('Notification') {
            steps {
                script {
                    echo "Deployment completed. Sending notifications."
                    // Add notification logic (e.g., email or Slack)
                }
            }
        }
    }
}

