import React from 'react';
import { Toaster } from 'react-hot-toast';
import AppHeader from './components/AppHeader';
import AppContent from './components/AppContent';
import PageTitle from './components/PageTitle';
import styles from './styles/modules/app.module.scss';

function App() {
  return (
    <>
      <div className="container">
        <PageTitle> TODO LIST</PageTitle>
        <div className={styles.app_wrapper}>
          <AppHeader />
          <AppContent />
        </div>
      </div>
      <Toaster
        position="bottom-right"
        toastOptions={{
          style: { fontSize: '1.4rem' },
        }}
      />
    </>
  );
}

export default App;
