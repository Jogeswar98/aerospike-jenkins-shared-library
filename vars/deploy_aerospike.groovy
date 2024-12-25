// vars/deploy_aerospike.groovy

def call() {
    pipeline {
        agent any

        stages {
            stage('Clone Repository') {
                steps {
                    script {
                        checkout scm
                    }
                }
            }

            stage('User Approval') {
                steps {
                    script {
                        input message: 'Approve Aerospike Deployment?', ok: 'Deploy'
                    }
                }
            }

            stage('Run Ansible Playbook') {
                steps {
                    script {
                        // Reference the playbook in the 'playbooks' directory
                        sh 'ansible-playbook playbooks/deploy_aerospike.yml -i localhost,'
                    }
                }
            }

            stage('Notification') {
                steps {
                    script {
                        echo 'Aerospike deployment has been completed!'
                    }
                }
            }
        }
    }
}

